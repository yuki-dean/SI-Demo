@XmlSchema(
        xmlns = {
                @XmlNs(prefix = NameSpace.SOAP_PREFIX, namespaceURI = NameSpace.SOAP_URI),
                @XmlNs(prefix = NameSpace.XSI_PREFIX, namespaceURI = NameSpace.XSI_URI),
                @XmlNs(prefix = NameSpace.XSD_PREFIX, namespaceURI = NameSpace.XSD_URI),
                @XmlNs(prefix = NameSpace.BASIC_PREFIX, namespaceURI = NameSpace.BASIC_URI)
        }
)

package com.train.weather;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;