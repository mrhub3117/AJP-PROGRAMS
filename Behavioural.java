10)behavioural 



interface Strategy {
    void execute();
}

class StrategyA implements Strategy {
    public void execute() {
        System.out.println("Executing Strategy A");
    }
}

class StrategyB implements Strategy {
    public void execute() {
        System.out.println("Executing Strategy B");
    }
}

class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new StrategyA());
        context.executeStrategy(); // Executing Strategy A

        context.setStrategy(new StrategyB());
        context.executeStrategy(); // Executing Strategy B
    }
}
