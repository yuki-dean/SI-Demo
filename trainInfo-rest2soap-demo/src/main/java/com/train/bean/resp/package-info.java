@XmlSchema(
        xmlns = {
                @XmlNs(prefix = com.train.xmlBeanTransformer.response.NameSpace.DIFFGR_PREFIX,namespaceURI = com.train.xmlBeanTransformer.response.NameSpace.DIFFGR_URI),
                @XmlNs(prefix = com.train.xmlBeanTransformer.response.NameSpace.MSDATA_PREFIX,namespaceURI = com.train.xmlBeanTransformer.response.NameSpace.MSDATA_URI),
                @XmlNs(prefix = com.train.xmlBeanTransformer.response.NameSpace.WEB_PREFIX,namespaceURI = NameSpace.WEB_URI)
        }
)
package com.train.bean.resp;

import com.train.xmlBeanTransformer.response.NameSpace;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;