import java.security.SecureRandom;


public class PostalCodeEntry {
    /** The prefix of the postal code. */
    private String prefix;
    /** The name of the place associated with the postal code. */
    private String placeName;
    /** The province associated with the postal code. */
    private String province;
    /** The latitude of the location. */
    private String latitude;
    /** The longitude of the location. */
    private String longitude;

    /**
     * Constructs a PostalCodeEntry object with specified attributes.
     * 
     * @param prefix The prefix of the postal code.
     * @param placeName The name of the place associated with the postal code.
     * @param province The province associated with the postal code.
     * @param latitude The latitude of the location.
     * @param longitude The longitude of the location.
     */
    public PostalCodeEntry(String prefix, String placeName, String province, String latitude, String longitude) {
        this.prefix = prefix;
        this.placeName = placeName;
        this.province = province;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Constructs a PostalCodeEntry object with no arguments.
     * All attributes are initialized to null.
     */
    public PostalCodeEntry() {
        this.prefix = null;
        this.placeName = null;
        this.province = null;
        this.latitude = null;
        this.longitude = null;
    }

    /**
     * Retrieves the prefix of the postal code.
     * 
     * @return The prefix of the postal code.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Retrieves the place name associated with the postal code.
     * 
     * @return The place name associated with the postal code.
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Retrieves the province associated with the postal code.
     * 
     * @return The province associated with the postal code.
     */
    public String getProvince() {
        return province;
    }

    /**
     * Retrieves the latitude of the location.
     * 
     * @return The latitude of the location.
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Retrieves the longitude of the location.
     * 
     * @return The longitude of the location.
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the prefix of the postal code.
     * 
     * @param prefix The prefix to be set.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Sets the place name associated with the postal code.
     * 
     * @param placeName The place name to be set.
     */
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    /**
     * Sets the province associated with the postal code.
     * 
     * @param province The province to be set.
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * Sets the latitude of the location.
     * 
     * @param latitude The latitude to be set.
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * Sets the longitude of the location.
     * 
     * @param longitude The longitude to be set.
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * Returns a string representation of the PostalCodeEntry object.
     * 
     * @return A string representation of the object.
     */
    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s", prefix, placeName, province, latitude, longitude);
    }

    /**
     * Generates a random prefix for a postal code.
     * The prefix consists of a letter 'K', followed by a random number and a random uppercase letter.
     * 
     * @return A randomly generated prefix for a postal code.
     */
    public static String getRandomPrefix() {
        SecureRandom rand = new SecureRandom();
        final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String number = "0123456789";
        int randA = rand.nextInt(alpha.length());
        int randN = rand.nextInt(number.length());
        return "K" + number.charAt(randN) + alpha.charAt(randA);
    }
}

