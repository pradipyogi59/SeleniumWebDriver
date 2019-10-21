package iSource.Utilities;

public class tes {

    static ExcelReader excel;

    public static void main(String[] args) {

        excel=new ExcelReader(System.getProperty("user.dir")+"/src/main/resources/Data/TestData.xlsx","Sheet1");
        String[][] s=excel.data();


    }
}