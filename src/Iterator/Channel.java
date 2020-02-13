package Iterator;

public class Channel {
	private double frequency;
	private ChannelTypeEnum TYPE;
	
	
	public Channel(double frequency, ChannelTypeEnum tYPE) {
		super();
		this.frequency = frequency;
		TYPE = tYPE;
	}
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}
	public void setTYPE(ChannelTypeEnum tYPE) {
		TYPE = tYPE;
	}
	
	@Override
	public String toString(){
		return "Frequency="+this.frequency+", Type="+this.TYPE;
	}
	
}
