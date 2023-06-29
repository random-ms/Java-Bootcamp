public class Championship {
    public static void main(String[] args) {
        // Test Case 1
        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points
        int margin = gryffindor - ravenclaw;

        if((margin) >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin>=0){
            System.out.println("In second place, Gryffindor!");
        } else if (margin >= -100){
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }

        // Test Case 2
        gryffindor = 850;
        ravenclaw = 500;
        margin = gryffindor - ravenclaw;

        if((margin) >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin>=0){
            System.out.println("In second place, Gryffindor!");
        } else if (margin >= -100){
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }

         // Test Case 3
         gryffindor = 620;
         ravenclaw = 500;
         margin = gryffindor - ravenclaw;
         
         if((margin) >= 300){
             System.out.println("Gryffindor takes the house cup!");
         } else if (margin>=0){
             System.out.println("In second place, Gryffindor!");
         } else if (margin >= -100){
             System.out.println("In third place, Gryffindor!");
         } else {
             System.out.println("In fourth place, Gryffindor!");
         }

          // Test Case 4
        gryffindor = 450;
        ravenclaw = 500;
        margin = gryffindor - ravenclaw;
        
        if((margin) >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin>=0){
            System.out.println("In second place, Gryffindor!");
        } else if (margin >= -100){
            System.out.println("In third place, Gryffindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }

         // Test Case 5
         gryffindor = 100;
         ravenclaw = 500;
         margin = gryffindor - ravenclaw;
         
         if((margin) >= 300){
             System.out.println("Gryffindor takes the house cup!");
         } else if (margin>=0){
             System.out.println("In second place, Gryffindor!");
         } else if (margin >= -100){
             System.out.println("In third place, Gryffindor!");
         } else {
             System.out.println("In fourth place, Gryffindor!");
         }
        
    }
}
