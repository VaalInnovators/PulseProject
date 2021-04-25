
INSERT INTO Employee
Select 'Ferry',
    'Tsolanku',
    1,
   'ferrytsolanku@gmail.com',
   'Moferefere1@',
    '2020-02-16',
    '2020-02-16',
    '0789582144',
    '1273',
    'Mfelang',
    'Boipatong',
    'Vanderbijlpark',
    1911,
    1;


INSERT INTO `pulsedb`.`governance_structure`
(`id`,
`GovernanceStructure_Name`,
`GovernanceStructure_Avaible`,
`GovernanceStructure_FullyFunctional`,
`GovernanceStructure_ResponsiblePerson`,
`GovernanceStructure_Comments`,
`GovernanceStructureAction_Who`,
`GovernanceStructureAction_When`,
`GovernanceStructureAction_Output`,
`GovernanceStructure_Date`,
`governance_structure_action_output`,
`governance_structure_action_when`,
`governance_structure_action_who`)
VALUES
(1,
'Counsil',
'Yes',
'Yes',
'Ferry',
'Done',
'Zeph',
'2021-03-16',
'Meet requirements',
'2021-03-29',
'Meet requirements',
'2021-04-05',
'Mokete');


INSERT INTO `pulsedb`.`financial_operation`
(`id`,
`financial_operation_description`,
`financial_operation_financed`,
`financial_operation_responsible_official`,
`financial_operation_comments`,
`financial_operation_action_who`,
`financial_operation_action_when`,
`financial_operation_action_output`,
`financial_operation_date`,
`financial_operation_financed`)
VALUES
(1,
'Equitable share (figure) received as scheduled',
'Yes',
'Ferry',
'Done',
'Zeph',
'2021-03-16',
'2021-03-16',
'Meet Requirements',
'2021-03-29');
