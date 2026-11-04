package Classes

class Location (
                var assigned_number_of_latest_know_location : Double, // To track / hold information and so it doesnt trace back to a person directly?
                var longitude : Double,
                var latitude : Double
                )
{
    fun retrieveLocation() : String {
        return "#OfLocation : $assigned_number_of_latest_know_location, lon : $longitude, lat : $latitude"
    }
}