
package st10449724_prog6112_exam;

/**
 *
 * @author RC_Student_Lab
 */
interface IProductSales {
    
    public int TotalSales(int[][] productSales){
        int total = 0;
        for (int[]yearSales : productSales){
            for (int sale : yearSales){
                total += sale;
            }
        }
        return total;
    }
    
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
