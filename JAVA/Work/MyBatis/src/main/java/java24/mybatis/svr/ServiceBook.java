package java24.mybatis.svr;

import java.util.Date;
import java.util.List;

import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelBook;

public class ServiceBook implements IServiceBook {

    @Override
    public int getCount(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMaxBookid() throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<ModelBook> selectAll(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ModelBook> selectLike(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ModelBook> selectEqual(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insert(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int insertMap(String bookname, Date dtm, int authid)
            throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(ModelBook wherebook, ModelBook setbook) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteBook(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<ModelBook> selectDynamic(ModelBook book) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
}
