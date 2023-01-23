package dev.NicoGH.moviesapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "Movies")
// Lombok creates the Getters and Setters
@Data
// Creates a constructor with all the parameters
@AllArgsConstructor
// Creates a constructor with no parameters
@NoArgsConstructor
public class Movie {
    // Matches the id with the db
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    // This annotation will make Spring to save into the db the ID's from the review on one list,
    // and the reviews on a separate list.
    @DocumentReference
    private List<Review> reviewIds;


}
