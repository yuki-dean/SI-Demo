@XmlSchema(
        xmlns = {
                @XmlNs(prefix = NameSpace.XSI_PREFIX, namespaceURI = NameSpace.XSI_URI),
                @XmlNs(prefix = NameSpace.XSD_PREFIX, namespaceURI = NameSpace.XSD_URI),
                @XmlNs(prefix = NameSpace.SOAP12_PREFIX, namespaceURI = NameSpace.SOAP12_URI),
                @XmlNs(prefix = NameSpace.N_PREFIX, namespaceURI = NameSpace.N_URI)
        }
)
package test.model.weatherRequest;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;