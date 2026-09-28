//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Yearly sales {
public static void main() { String [] args) {

    String[] cities = {"Cape Town","Port Elizabeth","Pretoria"};

     String [] consoles={"PS5","XBXOX","NINTENDO SWITCH"};


    int [][] sales = {
            {1000,2000,3000},
            {2000,3000,4000},
            {1500,1100,1200}

    };



    System.out.println("--------------------------------------------------------------");
    System.out.println("GAMING CONSOLE REPORT");
    System.out.println("--------------------------------------------------------------");


    System.out.printf("%-15 %-10s %-10s %-18s %-10s%n","City","PS5","xbox","Nintendo switch");

    int maxSales =0;
    int maxCityIndex=0;

    for (int i = 0;i < cities.length;i++){
    int total =sales[i][0] +sales[i][1] + sales[i][2];

    System.out.printf("%-15s %10d %-10d %-18d %-10d", cities[i],sales[i][0],
    sales[i][1],sales[i][2],total);

    if (total >= 500){
        System.out.print("***");
    }
    System.out.ptintln();

    if (total >maxSales){
        maxSales =total;
        maxCityIndex = i;
    }
    }

    System.out.println("--------------------------------------------------------------");
    System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
    System.out.println("--------------------------------------------------------------");


    int totalsPS5=0,totalXBOX=0,totalSwitch=0;
    for(int i =0;i<cities.length;i++){
        totalPS5 +=sales[i][0];
        totalXBOX +=sales[i][1];
        totalSwitch +=sales[i][2];
    }

    System.out.println("TOTAL XBOX SALES:" + totalXBOX);
    System.out.println("Total XBOX SALES:" +totalswitch);
    System.out.println("Total PS5 SALES:" +totalsPS5);

    System.out.println();
    System.out.println("CITY WITH THE MOST sales:"+ cities[maxCityIndex]+"("+maxSales +" sales)");

    System.out.println("--------------------------------------------------------------");

 }
}
