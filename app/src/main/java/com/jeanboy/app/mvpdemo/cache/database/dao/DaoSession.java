package com.jeanboy.app.mvpdemo.cache.database.dao;

import com.jeanboy.app.mvpdemo.cache.database.model.TokenModel;
import com.jeanboy.app.mvpdemo.cache.database.model.UserModel;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig tokenModelDaoConfig;
    private final DaoConfig userModelDaoConfig;

    private final TokenModelDao tokenModelDao;
    private final UserModelDao userModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        tokenModelDaoConfig = daoConfigMap.get(TokenModelDao.class).clone();
        tokenModelDaoConfig.initIdentityScope(type);

        userModelDaoConfig = daoConfigMap.get(UserModelDao.class).clone();
        userModelDaoConfig.initIdentityScope(type);

        tokenModelDao = new TokenModelDao(tokenModelDaoConfig, this);
        userModelDao = new UserModelDao(userModelDaoConfig, this);

        registerDao(TokenModel.class, tokenModelDao);
        registerDao(UserModel.class, userModelDao);
    }
    
    public void clear() {
        tokenModelDaoConfig.clearIdentityScope();
        userModelDaoConfig.clearIdentityScope();
    }

    public TokenModelDao getTokenModelDao() {
        return tokenModelDao;
    }

    public UserModelDao getUserModelDao() {
        return userModelDao;
    }

}