package com.real.vivek.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.real.vivek.dao.ClaimRepoDAO;
import com.real.vivek.model.ClaimInfo;

@RestController
@RequestMapping("/claim")
public class ClaimSearchController {

	@Autowired
	private ClaimRepoDAO claimRepoDAO;

	@GetMapping("/search/{claimId}")
	public ClaimInfo getClaimInformation(@PathVariable Integer claimId) {
		Optional<ClaimInfo> claim = claimRepoDAO.findById(claimId);
		ClaimInfo claimInfo = claim.get();
		return claimInfo;
	}

	@PostMapping
	public String postClaimInformation(@RequestBody ClaimInfo claimInfo) {
		ClaimInfo claim = claimRepoDAO.save(claimInfo);
		return "Successfully inserted claim with Id: " + claim.getClaimId();
	}

}
