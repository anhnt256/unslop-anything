<template>
  <section class="pricing">
    <h1>Simple pricing</h1>
    <button class="plan transition-colors" @click="select('pro')">
      <span>Pro plan</span>
      <span>$29 per month</span>
    </button>
    <img src="/pro.png" alt="Pro plan dashboard preview" />
  </section>
</template>

<script setup>
const select = (plan) => console.log(plan);
</script>
