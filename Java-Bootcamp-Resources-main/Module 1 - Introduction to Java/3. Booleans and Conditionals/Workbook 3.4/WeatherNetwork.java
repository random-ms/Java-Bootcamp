public class WeatherNetwork {
    public static void main(String[] args) {
        
        //Test Case 1
        int temp = 25;  
        String forecast = "";
        if (temp<=-1){
            forecast = "The forecast is FREEZING! Stay home!";
        } else if (temp<=10){
            forecast = "The forecast is Chilly. Wear a coat!";
        } else {
            forecast = "It's warm. Go outside!";
        }
        System.out.println("Test Case 1: " + forecast);

          //Test Case 2
            temp = -1;  
            forecast = "";
          if (temp<=-1){
              forecast = "The forecast is FREEZING! Stay home!";
          } else if (temp<=10){
              forecast = "The forecast is Chilly. Wear a coat!";
          } else {
              forecast = "It's warm. Go outside!";
          }
          System.out.println("Test Case 2: " + forecast);

            //Test Case 3
            temp = 0;  
            forecast = "";
        if (temp<=-1){
            forecast = "The forecast is FREEZING! Stay home!";
        } else if (temp<=10){
            forecast = "The forecast is Chilly. Wear a coat!";
        } else {
            forecast = "It's warm. Go outside!";
        }
        System.out.println("Test Case 3: " + forecast);

          //Test Case 4
             temp = 10;  
             forecast = "";
          if (temp<=-1){
              forecast = "The forecast is FREEZING! Stay home!";
          } else if (temp<=10){
              forecast = "The forecast is Chilly. Wear a coat!";
          } else {
              forecast = "It's warm. Go outside!";
          }
          System.out.println("Test Case 4: " + forecast);

            //Test Case 5
            temp = 11;  
            forecast = "";
        if (temp<=-1){
            forecast = "The forecast is FREEZING! Stay home!";
        } else if (temp<=10){
            forecast = "The forecast is Chilly. Wear a coat!";
        } else {
            forecast = "It's warm. Go outside!";
        }
        System.out.println("Test Case 5: " + forecast);

          //Test Case 6
           temp = -12;  
           forecast = "";
          if (temp<=-1){
              forecast = "The forecast is FREEZING! Stay home!";
          } else if (temp<=10){
              forecast = "The forecast is Chilly. Wear a coat!";
          } else {
              forecast = "It's warm. Go outside!";
          }
          System.out.println("Test Case 6: " + forecast);
    }
}
