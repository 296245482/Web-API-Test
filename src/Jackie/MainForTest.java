package Jackie;

/**
 * Created by 29624 on 2016/7/8.
 */
public class MainForTest {
    public static void main(String[] args){

        //获得本次的SID，并记录在电脑的cookies里
        Auth.getAuth("api=SYNO.API.Auth&method=Login&version=2&account=appletest&passwd=z1x2c3v4&session=SurveillanceStation&format=cookies");

    }
}
