package Iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

	private List<Channel> channelsList;

	public ChannelCollectionImpl() {
		super();
		// TODO Auto-generated constructor stub
		channelsList = new ArrayList<>();
	}

	@Override
	public void addChannel(Channel c) {
		// TODO Auto-generated method stub
		this.channelsList.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		// TODO Auto-generated method stub
		this.channelsList.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		// TODO Auto-generated method stub
		return new ChannelIteratorImpl(type, this.channelsList);
	}

	private class ChannelIteratorImpl implements ChannelIterator {

		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;

		public ChannelIteratorImpl(ChannelTypeEnum ty, List<Channel> channelsList) {
			this.type = ty;
			this.channels = channelsList;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			while (position < channels.size()) {
				Channel c = channels.get(position);
				if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
					return true;
				} else
					position++;
			}
			return false;
		}

		@Override
		public Channel next() {
			// TODO Auto-generated method stub
			Channel c = channels.get(position);
			position++;
			return c;
		}

	}

}
