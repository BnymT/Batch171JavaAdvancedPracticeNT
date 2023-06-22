package practice04;

public class S04_Varargs_Restaurant {
    public static void main(String[] args) {

        /*
        Java programında, bir restoranın menüsündeki yemeklerin fiyatlarını hesaplayan bir metot yazmanız isteniyor.
        Metot, menüdeki yemeklerin isimlerini ve ardından fiyatlarını almalıdır.
        Menüdeki yemeklerin fiyatları toplamını döndüren ve menüye hiç yemek eklenmediğinde 0 döndüren bir metot yazın.
    */

        double total = totalFoodPrice("Corba","15.55", "Salata", "22.25", "Pide", "35.95");

        System.out.println("Total Price = $" +total);
    }

    public static double totalFoodPrice(String...foods){

        double totalPrice =0;

        for (int i = 0; i < foods.length ; i+=2) {

            String food = foods[i];

            Double foodPrice =Double.valueOf(foods[i+1]); //mıymıntılık etmesin diye Double yaptık
            totalPrice += foodPrice;
            System.out.println( food +" = $"+ foodPrice);

        }
        return totalPrice;
    }

}