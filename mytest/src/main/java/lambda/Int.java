package lambda;

import org.springframework.integration.dsl.IntegrationFlowDefinition;

public interface Int {
    public IntegrationFlowDefinition<?> func(IntegrationFlowDefinition p);
}
