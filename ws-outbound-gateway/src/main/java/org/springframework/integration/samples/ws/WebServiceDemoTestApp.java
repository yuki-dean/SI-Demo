/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.samples.ws;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.support.channel.BeanFactoryChannelResolver;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.core.DestinationResolver;

/**
 * Demonstrates a web service invocation through a Web Service outbound Gateway.
 * A header-enricher provides the Soap Action prior to invocation. See the
 * 'servlet-config.xml' configuration file for more detail.
 *
 * @author Marius Bogoevici
 */
public class WebServiceDemoTestApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("/META-INF/spring/integration/temperatureConversion.xml");
		DestinationResolver<MessageChannel> channelResolver = new BeanFactoryChannelResolver(context);

		// Compose the XML message according to the server's schema
		String requestXml =
				/*
				" <?xml version=\"1.0\" encoding=\"utf-8\"?> " +
			"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" +
			" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">" +
			"<soap12:Body>" +
					"<getWeatherbyCityName xmlns=\"http://WebXml.com.cn/\">" +
					"<theCityName>桂林</theCityName>" +
					"</getWeatherbyCityName>" +
					"</soap12:Body>" +
					"</soap12:Envelope>";
					*/
				"<FahrenheitToCelsius xmlns=\"http://www.w3schools.com/xml/\">" +
						"<Fahrenheit>90.0</Fahrenheit>" +
				"</FahrenheitToCelsius>";

		// Create the Message object
		Message<String> message = MessageBuilder.withPayload(requestXml).build();

		// Send the Message to the handler's input channel
		MessageChannel channel = channelResolver.resolveDestination("fahrenheitChannel");
		MessageChannel channel2 = channelResolver.resolveDestination("c2");
		channel2.send(message);
		channel.send(message);
	}

}
