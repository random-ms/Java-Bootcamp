import java.util.Arrays;

public class UpdateArrays {
    public static void main(String[] args){
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        String[] newMenu = new String[5];

        for(int i = 0; i < menu.length; i++){
            System.out.println(i + ". " + menu[i]);
            newMenu[i] = menu[i];
        }
    }
    
}
