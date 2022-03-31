class Pro{
	static final Stirig[] list = {"50.206.25.109:80","121.156.109.108:8080",
"85.25.108.234:5566",
"51.81.80.44:80",
"145.40.73.102:10013",
"103.213.213.18:83",
"120.220.220.95:8085",
"200.122.255.42:999",
"103.241.109.130:3128",
"80.83.229.234:8081",
"36.94.2.138:443"};
	public static void main(String[] a){
		String[] h = list[0].split(":");\
		System.out.println(h[0] +"  socket:"+h[1]);
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(h[0], h[1]));
		conn = new URL("").openConnection(proxy);
	}
}