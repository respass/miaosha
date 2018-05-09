package scu.zpf.seckill.redis;



public class UserKey extends BasePrefix {

    private UserKey(int expireSeconds, String prefix) {
        super(prefix, expireSeconds);
    }

    //cookie过期时间7天
    public static  final int TOKEN_EXPIRE = 24 * 3600 * 7;

    public static UserKey token = new UserKey(TOKEN_EXPIRE, "tk-" );


}
