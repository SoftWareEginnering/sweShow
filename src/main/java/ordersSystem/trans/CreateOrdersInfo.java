package ordersSystem.trans;

public class CreateOrdersInfo {
	private String accountName;  // 订单发起人
	
	// 订单名称
	private String ordersName;
	
	// 用户偏好优先度
	private String userPriority;
	
	
	// 发件人信息
	private String senderName;
	private String senderPhone;
	private String[] senderAddress; // 省 / 市 / (县/区)
	private String senderDetailAddress;
	private String senderLng;
	private String senderLat;

	public String getSenderLng() {
		return senderLng;
	}

	public void setSenderLng(String senderLng) {
		this.senderLng = senderLng;
	}

	public String getSenderLat() {
		return senderLat;
	}

	public void setSenderLat(String senderLat) {
		this.senderLat = senderLat;
	}

	public String getReceiverLng() {
		return receiverLng;
	}

	public void setReceiverLng(String receiverLng) {
		this.receiverLng = receiverLng;
	}

	public String getReceiverLat() {
		return receiverLat;
	}

	public void setReceiverLat(String receiverLat) {
		this.receiverLat = receiverLat;
	}

	// 收件人信息
	private String receiverName;
	private String receiverPhone;
	private String[] receiverAddress;
	private String receiverDetailAddress;
	private String receiverLng;
	private String receiverLat;

	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderPhone() {
		return senderPhone;
	}
	public void setSenderPhone(String senderPhone) {
		this.senderPhone = senderPhone;
	}
	public String getSenderDetailAddress() {
		return senderDetailAddress;
	}
	public void setSenderDetailAddress(String senderDetailAddress) {
		this.senderDetailAddress = senderDetailAddress;
	}
	public String[] getSenderAddress() {
		return senderAddress;
	}
	public void setSenderAddress(String[] senderAddress) {
		this.senderAddress = senderAddress;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String[] getReceiverAddress() {
		return receiverAddress;
	}
	public void setReceiverAddress(String[] receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getReceiverDetailAddress() {
		return receiverDetailAddress;
	}
	public void setReceiverDetailAddress(String receiverDetailAddress) {
		this.receiverDetailAddress = receiverDetailAddress;
	}
	public String getUserPriority() {
		return userPriority;
	}
	public void setUserPriority(String userPriority) {
		this.userPriority = userPriority;
	}
	public String getOrdersName() {
		return ordersName;
	}
	public void setOrdersName(String ordersName) {
		this.ordersName = ordersName;
	}
	
}
