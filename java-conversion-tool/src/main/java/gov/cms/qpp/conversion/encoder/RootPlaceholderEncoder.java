package gov.cms.qpp.conversion.encoder;

import java.io.Writer;

import gov.cms.qpp.conversion.model.JsonEncoder;
import gov.cms.qpp.conversion.model.Node;

@JsonEncoder(templateId = "placeholder")
public class RootPlaceholderEncoder extends QppOutputEncoder {

	public RootPlaceholderEncoder() {
	}

	@Override
	public void encode(Writer writer, Node node, int indentLevel) throws EncodeException {
		// does not do anything

	}

}
