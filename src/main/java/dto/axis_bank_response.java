package dto;

import java.util.List;

import lombok.Data;

@Data
public class axis_bank_response {
    private List<axis_bank_dto> content;
    private int pageNo;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean lastpage;
}
