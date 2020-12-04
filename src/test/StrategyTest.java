import Builder.Director;
import Builder.ProducerBuilder;
import Builder.WorkerBuilder;
import Strategy.DarkIngredient;
import Strategy.IngredientStrategy;
import Strategy.WhiteIngredient;
import Worker.Worker;

/**
 * @author Brian.Z
 * @project chocolateFactory
 * @classname StrategyTest
 * @description TODO
 * @date 2020/12/3 15:43
 */
public class StrategyTest {

    public static void main(String[] args) {
        //建造一个工人
        Director director=new Director();
        WorkerBuilder producerBuilder = new ProducerBuilder();
        director.setBuilder(producerBuilder);
        Worker a = director.construct();
        //初始化策略
        IngredientStrategy ws = new WhiteIngredient();
        a.setStrategy(ws);
        a.add();
        IngredientStrategy ds = new DarkIngredient();
        a.setStrategy(ds);
        a.add();
    }
}
