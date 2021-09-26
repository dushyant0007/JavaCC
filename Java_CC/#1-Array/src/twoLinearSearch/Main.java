package twoLinearSearch;

public class Main {

    public static void main(String[] args) {
int [] a = {12,34,45,23,45234,234,35,7,3,2,1,9};
 //       search(a,18);

String name = "dushyant jakhar";
    //    System.out.println(find(name, 'p'));
    //    System.out.println(rangeSearch(name,'s',3,7));


    }


//    search in the array
    public static int search (int [] a , int b){
        if(a.length == 0 ){return-1;}
        for (int j : a) {
            if (j == b) {
                System.out.println(" The item " + b + " is found in array");
                return j;

              }
            }
        System.out.println("Item is not "+ b +" found");
         return -1;
    }


    //    Search in string
    public static boolean find (String str , char target){
              if (str.length()==0){return false;}
              for (int i  = 0 ; i < str.length();i++){
                  if (target == str.charAt(i)){
                      return true;
                  }
              }
              return false;
    }


    ///    Searching in a range
    public static boolean rangeSearch(String str , char target , int startIndex , int endIndex){
      if (str.length()==0){return false ;}
      for (int i = startIndex ; i <=endIndex ; i++){
          if (str.charAt(i) ==target) {return true;}
      }
        return false;
    }


    }


