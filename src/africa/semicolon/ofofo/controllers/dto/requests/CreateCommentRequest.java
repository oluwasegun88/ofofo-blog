package africa.semicolon.ofofo.controllers.dto.requests;


import lombok.Data;

@Data
public class CreateCommentRequest {

    private String getId;

    private String commenterName;

    private String comment;


}
