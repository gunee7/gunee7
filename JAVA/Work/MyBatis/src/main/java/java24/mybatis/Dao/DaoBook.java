package java24.mybatis.Dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java24.mybatis.inf.IBook;
import java24.mybatis.model.ModelBook;
@Repository("daobook")
public class DaoBook implements IBook {

    @Autowired
    @Qualifier("sqlSession") 
    private SqlSession session;
            
    
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
        session.selectList("mapper.mapperBook.selectEqual");
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
