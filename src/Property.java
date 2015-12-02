
// Property exists in several types and exists in different media, giving
//  it a context to which it exists in.
public class Property {
	Type propertyType;
	Media media;
	Context context;
	
	public Property(Typep t, Media m, Context c) {
		propertyType = t;
		media = m;
		context = c;
	}
	
	public Type getType() {
		return propertyType;
	}
	
	public Media getMedia() {
		return media;
	}
	
	public Context getContext() {
		return context;
	}
}
