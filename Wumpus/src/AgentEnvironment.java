import jade.core.Agent;

public class AgentEnvironment extends Agent {

    protected void setup() {
        System.out.println("Hello! Agent-Environment " + getAID().getName() + " is ready.");
    }
}
