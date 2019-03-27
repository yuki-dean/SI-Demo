@XmlSchema(
        xmlns = {
                @XmlNs(prefix = NameSpace.DIFFGR_PREFIX,namespaceURI = NameSpace.DIFFGR_URI),
                @XmlNs(prefix = NameSpace.MSDATA_PREFIX,namespaceURI = NameSpace.MSDATA_URI),
                @XmlNs(prefix = NameSpace.WEB_PREFIX,namespaceURI = NameSpace.WEB_URI)
        }
)
package com.train.xmlBeanTransformer.response;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;