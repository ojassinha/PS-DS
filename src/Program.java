import GFGService.GFGProblemsImpl;
import GFGService.IGFGProblems;

/**
 * Created by zedray on 8/1/18.
 */
public class Program {

    public static void main(String[] args){

        IGFGProblems problems = new GFGProblemsImpl();

        //problems.runTreeTopView();
        // problems.runLCA();

        problems.runMaxSum();


    }
}
