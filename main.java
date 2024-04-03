
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
// winter, soring, summer, autumnn
    //warm jacket, t-shirt, swimming suit, rain coat
    String season = "qwerty";//season
    
        if (season=="winter") {//false 1
      System.out.println("Wear a warm jacket!");
    }
   else if (season=="spring") {//true 2
      System.out.println("Wear a T-shirt!");
    }
   else if (season =="summer") {//false (not needed)
      System.out.println("Wear a swimming suite!");
    }
   else if (season =="autumn") {//false (not needed)
      System.out.println("Wear a rain coat!");
    }
    else{
      System.out.println("I do not recognize this season!");
    }

    



    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
