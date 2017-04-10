package gov.cms.qpp.conversion.encode;

import gov.cms.qpp.conversion.model.Encoder;
import gov.cms.qpp.conversion.model.EncoderNew;
import gov.cms.qpp.conversion.model.Node;
import gov.cms.qpp.conversion.model.TemplateId;

/**
 * Encoder to serialize Improvement Activity Section. This class is nearly empty due to the fact that it does the same
 * encoding as its super class {@link gov.cms.qpp.conversion.encode.AciSectionEncoder} but is a different templateId.
 */
@EncoderNew(templateId = TemplateId.IA_SECTION)
public class IaSectionEncoder extends AciSectionEncoder {

    @Override
    public void internalEncode(JsonWrapper wrapper, Node node) throws EncodeException {
        super.internalEncode(wrapper, node);
    }
}
