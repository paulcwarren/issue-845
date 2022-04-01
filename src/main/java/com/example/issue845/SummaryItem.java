package com.example.issue845;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;


@Getter
@Setter
@Embeddable
public class SummaryItem {

	protected String highlight;
	protected String description;
}
