/*
*定义接口门铃
*/

/*
*如果一个类只由抽象方法和全局常量组成，那么这种情况下不会将其定义为一个抽象类。
*只会定义为一个接口，所以接口严格的来讲属于一个特殊的类，
*而这个类里面只有抽象方法和全局常量，就连构造方法也没有
*/
interface DingRing {
	public static final String voice = "Dingdingding...";

	void make_vioce();
}


interface BiLiRing {
	public static final String voice = "BiliBili...";

	void make_vioce();
}