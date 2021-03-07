import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class RootObject {
    private String contextId;
    private boolean success;
    private int code;
    private List<Result> results;
    private boolean finished;
    private int page;
    private int pageSize;
    private String postback;
    private String pin;

    @JsonProperty("contextId")
    public String getContextId() {
        return contextId;
    }

    @JsonProperty("contextId")
    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    @JsonProperty("success")
    public boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(boolean success) {
        this.success = success;
    }

    @JsonProperty("code")
    public int getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(int code) {
        this.code = code;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonProperty("finished")
    public boolean getFinished() {
        return finished;
    }

    @JsonProperty("finished")
    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @JsonProperty("page")
    public int getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(int page) {
        this.page = page;
    }

    @JsonProperty("pageSize")
    public int getPageSize() {
        return pageSize;
    }

    @JsonProperty("pageSize")
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @JsonProperty("postback")
    public String getPostback() {
        return postback;
    }

    @JsonProperty("postback")
    public void setPostback(String postback) {
        this.postback = postback;
    }

    @JsonProperty("pin")
    public String getPin() {
        return pin;
    }

    @JsonProperty("pin")
    public void setPin(String pin) {
        this.pin = pin;
    }
}
