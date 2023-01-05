package Day13_ExelWrite;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02 {

    @Test
    public void test01() throws IOException {
        //exel den kopyaaldigimiz workbook objesinde degisiklik yapabiliriz bunun icin exel wrtbook kopyasi olusturalim
        String dosyaYolu= "C:\\Users\\omera\\OneDrive\\Desktop\\ulkeler.xlsx";
        // Ulkeler excel'indeki sayfa1'e gidecek sekilde ayarlari yapalim

        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);
        // 5,sutunolarak nufus basligi yapalim
        workbook.getSheet("Sayfa1").getRow(0).createCell(5).setCellValue("Nufus");
        //3,satir nufusu 1500000  girin
        workbook.getSheet("Sayfa1").getRow(2).createCell(5).setCellValue("1500000");
        // bu workbook degisikligini Exel ekayit edecegiz
        FileOutputStream fos =new FileOutputStream(dosyaYolu);
        workbook.write(fos);
        workbook.close();
        fis.close();
        fos.close();


    }

}
