package CH4.rating;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import static CH4.rating.CalculateAverageRatingForProduct.*;

public class CalculateAverageRatingForProduct {
    //CSV file의 row는 각 고객이 5개의 상품 각각에 대한 평가를 나타냄.
    //rating 1이면 poor 5면 exellent 0인 경우 not rate.
    //각 product들에 대한 평균 rating 계산해야함.
    //해당 프로그램은 반드시 5개의 품복에 대해 평가할 수 있어야하고, customer가 몇명이던 처리할 수 있어야함.
    //HashMap<String, ArrayList<int>> key는 상품명 value는 해당상품에 대한 고객평가점수

    public static void main(String[] args) throws IOException{
        CalculateAverageRatingForProduct calculateAverageRatingForProduct = new CalculateAverageRatingForProduct();
        HashMap<String, ArrayList<Integer>> customerRating = calculateAverageRatingForProduct.readCSV();
        calculateAverageRatingForProduct.PrintResult(customerRating, calculateAverageRatingForProduct);
    }

    public HashMap<String, ArrayList<Integer>> readCSV() throws IOException {

        HashMap<String, ArrayList<Integer>> customerRating = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("/Users/yong/spring/AbsoluteJAVA/src/CH4/rating/rating.csv"));
        String delimiters = ",";
        int lineCnt = 0;

        while(true){
            String line = br.readLine();
            lineCnt++;
            if(line == null) break;
            StringTokenizer stringTokenizer = new StringTokenizer(line,",");
            int RatingEachRow = stringTokenizer.countTokens();
            for(int i = 0; i < RatingEachRow; i++){
                //각 product hashmap에 key로 등록
                if(lineCnt == 1){
                    customerRating.put(stringTokenizer.nextToken(), new ArrayList<Integer>());
                }
                else{
                    customerRating.get(mapProductToKey(i)).add(Integer.parseInt(stringTokenizer.nextToken()));
                }
            }
        }
        return customerRating;
    }
    
    public String mapProductToKey(Integer index){
        if(index == 0)
            return "A";
        else if(index == 1)
            return "B";
        else if(index == 2)
            return "C";
        else if(index == 3)
            return "D";
        else
            return "E";
    }

    public void PrintResult(HashMap<String, ArrayList<Integer>> customerRating
    , CalculateAverageRatingForProduct calculateAverageRatingForProduct) throws IOException{

        Integer numOfCustomer = customerRating.get(mapProductToKey(0)).size();
        System.out.println("customerRating = " + customerRating);
        System.out.println("Product | rating average");
        for(int i = 0; i < customerRating.size(); i++){
            int sum = 0;
            for(int j = 0; j < numOfCustomer; j++){
                String keyofProduct = mapProductToKey(i);
                sum += customerRating.get(keyofProduct).get(j);
            }
            String keyofProduct = mapProductToKey(i);
            double ratingAverage = (double)sum / numOfCustomer;
            System.out.println(String.format("%s\t\t\t%.4f", keyofProduct, ratingAverage));
        }
    }
}
