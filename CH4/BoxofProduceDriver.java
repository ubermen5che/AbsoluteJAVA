package CH4;

import CH4.BoxOfProduce;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BoxofProduceDriver {

    public static void main(String[] args) throws IOException {
        ArrayList<String> produceList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/yong/spring/AbsoluteJAVA/src/CH4/produce_list.txt"));
        while(true){
            String line = br.readLine();
            if(line == null) break;
            produceList.add(line);
        }
        int pListSize = produceList.size()-1;

        BoxOfProduce bp = new BoxOfProduce(produceList.get((int)(Math.random() * pListSize)), produceList.get((int)(Math.random() * pListSize)),
                produceList.get((int)(Math.random() * pListSize)));

        br.close();
    }
}
