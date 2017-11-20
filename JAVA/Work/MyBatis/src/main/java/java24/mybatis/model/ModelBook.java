package java24.mybatis.model;

public class ModelBook {
   private Integer         bookid      = null;    //`bookid` INT(11) NOT NULL AUTO_INCREMENT,
   private String          bookname    = "";      //`bookname` VARCHAR(50) NULL DEFAULT NULL,
   private String          publisher   = "";      //`publisher` VARCHAR(40) NULL DEFAULT NULL,
   private String          year        = "";      //`year` VARCHAR(10) NULL DEFAULT NULL,
   private Integer         price       = null;    //`price` INT(11) NULL DEFAULT NULL,
   private java.util.date  dtm         = null;    // `dtm` DATE NULL DEFAULT NULL,
   private Boolean         use_yn      = null;    // `use_yn` BIT(1) NULL DEFAULT NULL,
   private Integer         authid      = null;    //`authid` INT(11) NULL DEFAULT NULL,
}
