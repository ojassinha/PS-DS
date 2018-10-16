package HackerrankProblems;

import CommonService.CommonProblemServices;
import Models.CrosswordRequest;

import java.util.*;

/**
 * Created by zedray on 10/15/18.
 */
public class CrosswordPuzzle implements CommonProblemServices{
    @Override
    public Object createRequestBody() {
        Scanner scan = new Scanner(System.in);
        char[][] matrix = new char[10][10];
        for(int i  =0;i <10;i++){
            String line = scan.nextLine();
            char[] chars = line.toCharArray();
            for(int j = 0;j < 10;j++) {
                matrix[i][j] = chars[j];
            }
        }

        List<String> words = new Vector<>();
        words.add("POLAND");
        words.add("LHASA");
        words.add("SPAIN");
        words.add("INDIA");

        CrosswordRequest request = new CrosswordRequest();
        request.matrix = matrix;
        request.words = words;
        return request;

    }

    @Override
    public Object execute(Object node) {
        CrosswordRequest request = (CrosswordRequest) node;
        char[][] matrix = request.matrix;
        List<String> words = request.words;
        Map<Integer,String> wordsMap = new HashMap<>();
        for (String wrd : words){
            wordsMap.put(wrd.length(),wrd);
        }

        // TBD
        return null;

    }

    private char[][] crossUtil(char[][] matrix,Map wordsMap,int r,int c,boolean isHorizontal){
        if(r >9 || c > 9 || wordsMap.size() == 0)
            return matrix;

        String pattern = "";
        if(isHorizontal) {
            for (int i = 0; i < 10; i++) {
                if (matrix[r][i] != '+')
                    pattern += matrix[r][i];
            }
        }
        else{
            for (int i = 0; i < 10; i++) {
                if (matrix[i][c] != '+')
                    pattern += matrix[i][c];
            }
        }

//        if(wordsMap.containsKey(count)){
//            wordsMap.remove(count);
//        }

        return null;

    }


    @Override
    public void printResponse(Object result) {

    }
}
