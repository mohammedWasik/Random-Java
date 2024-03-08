package testNG;

import Utility.ReadXlsxData;
import org.testng.Assert;
import org.testng.annotations.*;

@Test()
public class SampleTest {
    @BeforeMethod
    public void hello(){
        System.out.println("hello");
    }

    @AfterMethod
    public void bye(){
        System.out.println("bye");
    }

    @DataProvider
    public Object[][] data() {
        return new String[][] {new String[] {"data1"}, new String[] {"data2"}};
    }

    @DataProvider(name="testData")
    public Object[] [] testDataData(){
        return  new Object[][]{
                {"admin","pass"},
                {"admin1","pass1"},
                {"admin2","pass2"},
                {"admin3","pass3"},
        };
    }

    @Test(dataProvider = "data",enabled = false)
    public void test(String d) {
        System.out.println(d);
        Assert.assertEquals("First Line\nSecond Line", "First Line\nSecond Line");
    }

    @Test(dataProviderClass = ReadXlsxData.class,dataProvider="login-data")
    public void loginTest(String username,String pass) {
        System.out.println(username+"  "+pass);   // Test logic here
        Assert.assertEquals("First Line\nSecond Line", "First Line\nSecond Line");

    }

    @Test(dataProvider ="testData" )
    public void test3(String username,String password){
        System.out.println(username+" "+password);
    }



    @DataProvider
    public String[][] providesCred(){
        return  new String[][]{
                {"adminula","passula"},
                {"admin1","pass1"},
                {"admin2","pass2"},
                {"admin3","pass3"},
        };
    }
    @Test(dataProvider ="providesCred" )
    public void RandomLoginTest(String user,String pass){
        System.out.println(user+" "+pass);

    }



}