import java.util.*;

class Result {

    public static void plusMinus(List<Integer> arr) {
        int positive=0;
        int negative=0;
        int zero=0;

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            arr.add(i,scanner.nextInt());
            if (arr.get(i)>0) {
                positive++;
            }
            else if(arr.get(i)<0) {
                negative++;
            }
        else{
                zero++;
            }
        }

        float ratioP=(float) positive/n;
        float ratioN=(float) negative/n;
        float ratioZ=(float) zero/n;
        System.out.println(String.format("%f",ratioP));
        System.out.println(String.format("%f",ratioN));
        System.out.println(String.format("%f",ratioZ));

    }
    public static void chriTree(){
        System.out.println(" ");
        for(int i =0;i<6;i++){
            for (int k=5;k>i;k--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("# ");
            }

            System.out.println();

        }
        for (int b=0;b<2;b++){
            System.out.println("    ||");
        }
        for (int a=0;a<6;a++){
            System.out.print("==");
        }
        System.out.println("");
        System.out.println("Merry Christmas");


    }
    public static void maxMin(){
        long []arr={0,0,0,0,0};
        long max=0;
        long max1=0;
        long min=0;
        long min1=0;
        long maxx=0;
        long minn=0;
        long mX,mN;

            max=Math.max(Math.max(arr[0],arr[1]),Math.max(arr[2],arr[3]));
            max1=Math.max(max,arr[4]);
            min=Math.min(Math.min(arr[0],arr[1]),Math.min(arr[2],arr[3]));
            min1=Math.min(min,arr[4]);
        System.out.println(min1+" "+max1);
        for (int v=0;v<5;v++){
            maxx+=arr[v];
            minn+=arr[v];}

        mN=minn-max1;
        mX=maxx-min1;
        System.out.println(mN+" "+mX);

    }
    public static String timeConversion(String s){
        String[] time= s.split(":");;
        String convertedTime=null;


        if (time[2].contains("AM")&& time[0].contains("12")){
            convertedTime="00:"+time[1]+":"+time[2];
        }else if (time[2].contains("AM")&& !time[0].contains("12")){

            convertedTime=s;
        }

        else if (time[2].contains("PM")&& time[0].contains("12")){
            convertedTime=s;

        }else {
            convertedTime=(Integer.parseInt(time[0])+12)+":"+time[1]+":"+time[2];
        }
if (time[2].contains("PM"))
        return convertedTime.replace("PM","");
    else
    return convertedTime.replace("AM","");}
    public static void shortPalindrome(){
        String s="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" +
                "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbvjooukatsdpqumhjedhzvjujlbwuxsopxpdxobeoygzqttlmoaobth" +
                "axwyhmpwpmjcyjezeqtfgzkqurtckmnbtyyfnkwzkpteymypojhjtuubwfstfdnmbavyrmtorlmjsmtwascshj" +
                "dviztnmuqppmhqamgikdjfdbtjcmqbkknjouoydpfrdpvdmlqiypdemefszlynxsucqaqkjnvrylbsubszlfcs" +
                "nhucljcknixyqhxfbduwhgbhjjfgttpbpfijfyaeuuaocohrxrrzcaywyyacuejjzismrflvtpxxeqjgyvezvo" +
                "inmsfccteqmppbvurdwntsgetekycnmjlamjwlwocprtsfyphzfdtjddfkrrgaxnakdsgdwfawhwsfyubglqcrn" +
                "weghlqzxxntlkmuulagadtyxvngtibmgrqpqawoszqwrfjtwoqbtofdjchytnihlqfslwgsgxybiewgiucinhrje" +
                "kxvhiafdcutgqozjohynwtrtlyrsbkxsnafvexzeoqjyhoiiihqdfapjlzomlfqnrwhwtkgvowzupujbiaxaykaaynn" +
                "cyptwjibhuegournvrzpxqmmfljxisweyakrvmsqyqnrvkmjmweadegejqrfnrbnxzqvyrccjfcivfqrxxh" +
                "ietbdrvadodlaizwlulbmgxyxokoxhvnwrwfqisnejwobzasmkdhswviotnoprjirmxkwqndrakjanogionawwkwqzswnsi" +
                "lsesozohddvchnhwyqbyyokodxrgewpvbofexpjfddaqbsactmlkomoyauuqgxomkcrhcyspeezmbyhdejfhyyrljuaslagvbpn" +
                "xwkcfffrxziduubhmiohjvammfqigjvxtmopwonkgdyrpxostlpjyxyumwwteraioobereucxcnpggndgjhkjzsynlugkojzkcxpzen" +
                "lkujgmgkyaazczqracebdvewozmfwqrmdyfexgbjle";
        int x=0;

     for (int i=0;i<s.length();i++){
         for (int j=3;j<s.length();j++){
             if (s.charAt(i)==s.charAt(j)){
             for (int a=i+1;a<j;a++){
                 for (int b=a+1;b<j;b++){
                     if (s.charAt(a)==s.charAt(b)){x++;}
                 }
             }
             }

             //if (s.charAt(i+1)==s.charAt(i+2)){x++;}
         }
     }
        System.out.println(x);}

}

public class Solution {
    public static void main(String[] args) {
      // Result.plusMinus(new ArrayList<>());
      // Result.chriTree();
      // Result.maxMin();
      //  System.out.println( Result.timeConversion("02:50:15AM"));
      //  Result.shortPalindrome();
}}