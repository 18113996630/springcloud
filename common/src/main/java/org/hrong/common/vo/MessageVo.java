package org.hrong.common.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class MessageVo implements Serializable {
	private static final long serialVersionUID = 2532787999336034402L;
	private Integer code;
	private String data;
}
