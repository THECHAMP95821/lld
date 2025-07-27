package lld.behavioral.ChainOfResponsibility;

class Manager extends Approver {
    @Override
    public void processLeaveRequest(int leaveDays) {
        if (leaveDays <= 7) {
            System.out.println("Manager approved the leave.");
        } else if (nextApprover != null) {
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
