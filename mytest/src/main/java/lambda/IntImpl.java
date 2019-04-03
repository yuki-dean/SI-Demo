package lambda;

import org.springframework.integration.dsl.IntegrationFlowDefinition;

public class IntImpl implements Int{
    @Override
    public IntegrationFlowDefinition<?> func(IntegrationFlowDefinition p) {
        return p.transform("");
    }
}
