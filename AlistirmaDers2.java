import java.util.ArrayList;
public class AlistirmaDers2 {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar=new ArrayList<Integer>();//bu array javada kullanılan classlardan biridir istediğimiz sayıda bir array oluşturmamızı sağlar
        //ilk başta 0 büyüküğünde array oluşur
        sayilar.add(15);//sayi ekleme işlemi
        sayilar.add(16);
        sayilar.add(17);//overload olmaz taşma yapmaz bu şekilde
        sayilar.add(18);
        sayilar.add(19);
        sayilar.add(20);


        System.out.println("Dizinizin boyutu "+sayilar.size());//kaç eleaman oldupunu verir
        System.out.println(sayilar.get(0));//0. indexteki yani ilk elemanı döndürür get metodu yazdığımız son elemana kadar bir boyut oluştutur out of bounds olabilir
        sayilar.add(3,31); //bu 3. indexin olduğu yere 31 sayısını ekler ve sonrakileri bir sağa kaydırır
        sayilar.remove(1);//1. indexteki sayi silinip atılır sonraki indexler öne kayar
        System.out.println(sayilar.contains(18));;//içerideki elemanı içerip içermediğini yazdırır
        System.out.println(sayilar.indexOf(20));//içerideki sayının varsa ilk bulduğu indexini döner yoksa -1 döner
        System.out.println(sayilar.isEmpty());//boş mu kontrolü
        System.out.println(sayilar.lastIndexOf(16));//birden fazla geçtiğinde son kez görülen index i verir
        // lastindexof ile indexof değerleri aynı ise eleman bir kere görülmüş demektir ama değerleri yani indexleri farklıysa birden fazla vardır
        for (int i=0;i<sayilar.size();i++){//yazdırma
            System.out.println(i+". indexteki sayi"+sayilar.get(i));
        }

    }
}
