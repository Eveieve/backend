package day32_0227.class02.boards;

import lombok.Data;

import java.sql.Blob;
import java.util.Date;

@Data
public class Board {

    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;
    private String bfilename;
    private Blob bfiledata;


}
