
package st10449724_prog6112_exam;

/**
 * @author Themba
 */
public class ProductSalesReporter{

    public static void main(String[] args) {
        int[][] salesData = {{300,150,700},{250,200,600}};
        int totalSales = 0;
        int maxSale = salesData[0][0];
        int minSale = salesData[0][0];
        int salesCount = 0;
        for(int i = 0;i < salesData.length; i++){
             for(int j = 0;j < salesData[i].length; j++){
                 int currentSale = salesData[i][j];
             totalSales += currentSale;
             if(currentSale > maxSale){maxSale = currentSale;
             }
             if(currentSale < minSale){minSale = currentSale;
             }
             salesCount++;
             }
        }
        
        double avarageSales = 0;
        if(salesCount > 0){
            avarageSales = (double) totalSales / salesCount;
        }
        
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println();
        System.out.println(String.format("Total sales:", totalSales));
        System.out.println(String.format("Avarage sales:", avarageSales));
        System.out.println(String.format("Maximum sales:", maxSale));
        System.out.println(String.format("Minimum Sales:", minSale));
    }
    
}

public class ProductSales implements IProductSales{
    
    @Override
    public int TotalSales(int[][] productSales){
        int total = 0;
        for (int[]yearSales : productSales){
            for (int sale : yearSales){
                total += sale;
            }
        }
        return total;
    }
    
    @Override
    public double AvarageSales(int[][] productSales){
        int total = TotalSales(productSales);
        int count = 0;
        for(int[] yearSales : productSales){
            count += yearSales.length;
        }
        if (count > 0){
            return (double) total / count;
        }else{
            return 0.0;
        }
    }
    
    @Override
    public int MaxSale(int[][] productSales){
        if (productSales == null || productSales.length == 0 || productSales[0].length == 0){
            return 0;
        }
        int max = productSales[0][0];
        for (int[] yearSale : productSales){
            for (int sale : yearSale){
                if (sale > max){
                    max = sale;
                }
            }
        }
        return max;
    }
    
    @Override
    public int MinSale(int[][] productSales){
        if (productSales == null || productSales.length == 0 || productSales[0].length == 0){
            return 0;
        }
        int min = productSales[0][0];
        for (int[] yearSale : productSales){
            for (int sale : yearSale){
                if (sale < min){
                    min = sale;
                }
            }
        }
        return min;
    }
}
