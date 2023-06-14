package baitap3;

public class tamgiac {
		private int ma;
		private int mb;
		private int mc;
		public tamgiac(int ma, int mb, int mc) {
			super();
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
		public tamgiac() {
			super();
		}
		public void setMa(int ma) {
			if(ma <= 0 )
				this.ma = 0;
			else this.ma = ma;
		}
		public int getMb() {
			return mb;
		}
		public void setMb(int mb) {
			if(mb <= 0 )
				this.mb = 0;
			else this.mb = mb;
		}
		public int getMc() {
			return mc;
		}
		public void setMc(int mc) {
			if(mc <= 0 )
				this.mc = 0;
			else this.mc = mc;
		}
		
		public double calChuVi() {
			return ma+mb+mc;
		}
		public double calDienTich() {
			float p = (ma+mb+mc)/2;
			double temp = p*(p-ma)*(p-mb)*(p-mc);
			double S = Math.sqrt(temp);
			return Math.sqrt(S); 
		}
		public String kiemTraTamGiac() {
			if ( ma+mb <=mc || ma+mc<=mb||mb+mc<= ma)
				return "khong phai la tam giac";
				else if ( ma==mb || ma==mc || mb==mc)
					return "tam giac can";
				else if(ma*ma + mb*mb == mc*mc|| ma*ma + mc*mc == mb*mb || mb*mb + mc*mc == ma*ma)
					return "tam giac vuong";
				else 
					return "tam giac thuong";			
		}
}
